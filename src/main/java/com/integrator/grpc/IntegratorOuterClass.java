// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: integrator.proto

package com.integrator.grpc;

public final class IntegratorOuterClass {
  private IntegratorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_Module_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_Module_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_RegisterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_RegisterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_StartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_StartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_StartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_StartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_Component_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_Component_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_Component_ParamsInputEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_Component_ParamsInputEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_Component_ParamsOutputEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_Component_ParamsOutputEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_DataType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_DataType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_SaveChainRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_SaveChainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_SaveChainResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_SaveChainResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_ExecuteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_ExecuteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_integrator_grpc_ExecuteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_integrator_grpc_ExecuteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020integrator.proto\022\023com.integrator.grpc\"" +
      "[\n\006Module\022\020\n\010moduleId\030\001 \001(\t\022\013\n\003url\030\002 \001(\t" +
      "\0222\n\ncomponents\030\003 \003(\0132\036.com.integrator.gr" +
      "pc.Component\"#\n\020RegisterResponse\022\017\n\007succ" +
      "ess\030\001 \001(\010\"W\n\014StartRequest\022\017\n\007chainId\030\001 \001" +
      "(\t\0226\n\016startComponent\030\002 \001(\0132\036.com.integra" +
      "tor.grpc.Component\" \n\rStartResponse\022\017\n\007s" +
      "uccess\030\001 \001(\010\"\316\002\n\tComponent\022\014\n\004name\030\001 \001(\t" +
      "\022D\n\013paramsInput\030\002 \003(\0132/.com.integrator.g" +
      "rpc.Component.ParamsInputEntry\022F\n\014params",
      "Output\030\003 \003(\01320.com.integrator.grpc.Compo" +
      "nent.ParamsOutputEntry\032Q\n\020ParamsInputEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022,\n\005value\030\002 \001(\0132\035.com.int" +
      "egrator.grpc.DataType:\0028\001\032R\n\021ParamsOutpu" +
      "tEntry\022\013\n\003key\030\001 \001(\t\022,\n\005value\030\002 \001(\0132\035.com" +
      ".integrator.grpc.DataType:\0028\001\"\247\001\n\010DataTy" +
      "pe\022\013\n\003str\030\001 \001(\t\022\013\n\003int\030\002 \001(\005\022\017\n\007boolean\030" +
      "\003 \001(\010\022\017\n\007byteall\030\004 \001(\014\0220\n\004type\030\005 \001(\0162\".c" +
      "om.integrator.grpc.DataType.Type\"-\n\004Type" +
      "\022\007\n\003INT\020\000\022\007\n\003STR\020\001\022\010\n\004BOOL\020\002\022\t\n\005BYTES\020\003\"",
      "%\n\020SaveChainRequest\022\021\n\tchainInfo\030\002 \001(\014\"$" +
      "\n\021SaveChainResponse\022\017\n\007success\030\001 \001(\010\"C\n\016" +
      "ExecuteRequest\0221\n\tcomponent\030\001 \001(\0132\036.com." +
      "integrator.grpc.Component\"D\n\017ExecuteResp" +
      "onse\0221\n\tcomponent\030\001 \001(\0132\036.com.integrator" +
      ".grpc.Component2\216\002\n\nIntegrator\022P\n\010Regist" +
      "er\022\033.com.integrator.grpc.Module\032%.com.in" +
      "tegrator.grpc.RegisterResponse\"\000\022P\n\005Star" +
      "t\022!.com.integrator.grpc.StartRequest\032\".c" +
      "om.integrator.grpc.StartResponse\"\000\022\\\n\tSa",
      "veChain\022%.com.integrator.grpc.SaveChainR" +
      "equest\032&.com.integrator.grpc.SaveChainRe" +
      "sponse\"\0002j\n\020IntegratorModule\022V\n\007Execute\022" +
      "#.com.integrator.grpc.ExecuteRequest\032$.c" +
      "om.integrator.grpc.ExecuteResponse\"\000B\002P\001" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_integrator_grpc_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_integrator_grpc_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_Module_descriptor,
        new String[] { "ModuleId", "Url", "Components", });
    internal_static_com_integrator_grpc_RegisterResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_integrator_grpc_RegisterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_RegisterResponse_descriptor,
        new String[] { "Success", });
    internal_static_com_integrator_grpc_StartRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_integrator_grpc_StartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_StartRequest_descriptor,
        new String[] { "ChainId", "StartComponent", });
    internal_static_com_integrator_grpc_StartResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_integrator_grpc_StartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_StartResponse_descriptor,
        new String[] { "Success", });
    internal_static_com_integrator_grpc_Component_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_integrator_grpc_Component_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_Component_descriptor,
        new String[] { "Name", "ParamsInput", "ParamsOutput", });
    internal_static_com_integrator_grpc_Component_ParamsInputEntry_descriptor =
      internal_static_com_integrator_grpc_Component_descriptor.getNestedTypes().get(0);
    internal_static_com_integrator_grpc_Component_ParamsInputEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_Component_ParamsInputEntry_descriptor,
        new String[] { "Key", "Value", });
    internal_static_com_integrator_grpc_Component_ParamsOutputEntry_descriptor =
      internal_static_com_integrator_grpc_Component_descriptor.getNestedTypes().get(1);
    internal_static_com_integrator_grpc_Component_ParamsOutputEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_Component_ParamsOutputEntry_descriptor,
        new String[] { "Key", "Value", });
    internal_static_com_integrator_grpc_DataType_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_integrator_grpc_DataType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_DataType_descriptor,
        new String[] { "Str", "Int", "Boolean", "Byteall", "Type", });
    internal_static_com_integrator_grpc_SaveChainRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_integrator_grpc_SaveChainRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_SaveChainRequest_descriptor,
        new String[] { "ChainInfo", });
    internal_static_com_integrator_grpc_SaveChainResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_integrator_grpc_SaveChainResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_SaveChainResponse_descriptor,
        new String[] { "Success", });
    internal_static_com_integrator_grpc_ExecuteRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_integrator_grpc_ExecuteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_ExecuteRequest_descriptor,
        new String[] { "Component", });
    internal_static_com_integrator_grpc_ExecuteResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_integrator_grpc_ExecuteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_integrator_grpc_ExecuteResponse_descriptor,
        new String[] { "Component", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
