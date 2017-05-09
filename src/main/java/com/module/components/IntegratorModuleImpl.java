package com.module.components;

import com.integrator.grpc.Component;
import com.integrator.grpc.DataType;
import com.integrator.grpc.IntegratorModuleGrpc;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * Created by KC on 07-May-17.
 */
public class IntegratorModuleImpl extends IntegratorModuleGrpc.IntegratorModuleImplBase{

    public void execute(com.integrator.grpc.ExecuteRequest request,
                        io.grpc.stub.StreamObserver<com.integrator.grpc.ExecuteResponse> responseObserver) {

        System.out.println("It is working :)");

        String sal = request.getComponent().getParamsInputMap().get("Salary").getStr();
        String gen = request.getComponent().getParamsInputMap().get("Gender").getStr();

        double dSal = Double.parseDouble(sal)* .33;
        if (gen.equals("female")){
            dSal = Double.parseDouble(sal) * .2;
        }
        String amount = Double.toString(dSal);
        Component component = Component.newBuilder()
                .putParamsInput("Salary", DataType.newBuilder().setStr(sal).setType(DataType.Type.STR).build())
                .putParamsInput("Gender", DataType.newBuilder().setStr(gen).setType(DataType.Type.STR).build())
                .putParamsOutput("Amount", DataType.newBuilder().setStr(amount).setType(DataType.Type.STR).build())
                .setName("TaxCalculator")
                .build();


        com.integrator.grpc.ExecuteResponse response = com.integrator.grpc.
                                                    ExecuteResponse.newBuilder().setComponent(component).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        System.out.println(amount);
    }
}
