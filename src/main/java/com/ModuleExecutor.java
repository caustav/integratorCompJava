package com;

import com.integrator.grpc.*;
import com.module.components.IntegratorModuleImpl;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.Console;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by KC on 07-May-17.
 */
public class ModuleExecutor {

    public static void main (String args[]) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.execute(new Runnable() {
            public void run() {
                Server server = ServerBuilder.forPort(8080)
                        .addService(new IntegratorModuleImpl()).build();
                try{
                    System.out.println("Starting server...");
                    server.start();
                    System.out.println("Server started!");
                    server.awaitTermination();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        //Register to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 3020)
                .usePlaintext(true)
                .build();

        IntegratorGrpc.IntegratorBlockingStub stub = IntegratorGrpc.newBlockingStub(channel);

        Component component = Component.newBuilder()
                .putParamsInput("Salary", DataType.newBuilder().setType(DataType.Type.STR).build())
                .putParamsInput("Gender", DataType.newBuilder().setType(DataType.Type.STR).build())
                .putParamsOutput("Amount", DataType.newBuilder().setType(DataType.Type.STR).build())
                .setName("TaxCalculator")
                .build();

        RegisterResponse response = stub.register(Module.newBuilder()
                .setModuleId("TAX1")
                .setUrl("localhost:8080")
                .addComponents(component)
                .build());

        System.out.println(response);

        channel.shutdown();

        exec.shutdown();
    }
}
