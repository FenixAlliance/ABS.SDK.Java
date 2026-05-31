

# ConstructorInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] [readonly] |
|**declaringType** | [**Type**](Type.md) |  |  [optional] |
|**reflectedType** | [**Type**](Type.md) |  |  [optional] |
|**module** | [**Module**](Module.md) |  |  [optional] |
|**customAttributes** | [**List&lt;CustomAttributeData&gt;**](CustomAttributeData.md) |  |  [optional] [readonly] |
|**isCollectible** | **Boolean** |  |  [optional] [readonly] |
|**metadataToken** | **Integer** |  |  [optional] [readonly] |
|**attributes** | [**AttributesEnum**](#AttributesEnum) |  |  [optional] [readonly] |
|**methodImplementationFlags** | [**MethodImplementationFlagsEnum**](#MethodImplementationFlagsEnum) |  |  [optional] [readonly] |
|**callingConvention** | [**CallingConventionEnum**](#CallingConventionEnum) |  |  [optional] [readonly] |
|**isAbstract** | **Boolean** |  |  [optional] [readonly] |
|**isConstructor** | **Boolean** |  |  [optional] [readonly] |
|**isFinal** | **Boolean** |  |  [optional] [readonly] |
|**isHideBySig** | **Boolean** |  |  [optional] [readonly] |
|**isSpecialName** | **Boolean** |  |  [optional] [readonly] |
|**isStatic** | **Boolean** |  |  [optional] [readonly] |
|**isVirtual** | **Boolean** |  |  [optional] [readonly] |
|**isAssembly** | **Boolean** |  |  [optional] [readonly] |
|**isFamily** | **Boolean** |  |  [optional] [readonly] |
|**isFamilyAndAssembly** | **Boolean** |  |  [optional] [readonly] |
|**isFamilyOrAssembly** | **Boolean** |  |  [optional] [readonly] |
|**isPrivate** | **Boolean** |  |  [optional] [readonly] |
|**isPublic** | **Boolean** |  |  [optional] [readonly] |
|**isConstructedGenericMethod** | **Boolean** |  |  [optional] [readonly] |
|**isGenericMethod** | **Boolean** |  |  [optional] [readonly] |
|**isGenericMethodDefinition** | **Boolean** |  |  [optional] [readonly] |
|**containsGenericParameters** | **Boolean** |  |  [optional] [readonly] |
|**methodHandle** | [**RuntimeMethodHandle**](RuntimeMethodHandle.md) |  |  [optional] |
|**isSecurityCritical** | **Boolean** |  |  [optional] [readonly] |
|**isSecuritySafeCritical** | **Boolean** |  |  [optional] [readonly] |
|**isSecurityTransparent** | **Boolean** |  |  [optional] [readonly] |
|**memberType** | [**MemberTypeEnum**](#MemberTypeEnum) |  |  [optional] [readonly] |



## Enum: AttributesEnum

| Name | Value |
|---- | -----|
| PRIVATE_SCOPE | &quot;PrivateScope&quot; |
| PRIVATE | &quot;Private&quot; |
| FAM_AND_ASSEM | &quot;FamANDAssem&quot; |
| ASSEMBLY | &quot;Assembly&quot; |
| FAMILY | &quot;Family&quot; |
| FAM_OR_ASSEM | &quot;FamORAssem&quot; |
| PUBLIC | &quot;Public&quot; |
| MEMBER_ACCESS_MASK | &quot;MemberAccessMask&quot; |
| UNMANAGED_EXPORT | &quot;UnmanagedExport&quot; |
| STATIC | &quot;Static&quot; |
| FINAL | &quot;Final&quot; |
| VIRTUAL | &quot;Virtual&quot; |
| HIDE_BY_SIG | &quot;HideBySig&quot; |
| NEW_SLOT | &quot;NewSlot&quot; |
| CHECK_ACCESS_ON_OVERRIDE | &quot;CheckAccessOnOverride&quot; |
| ABSTRACT | &quot;Abstract&quot; |
| SPECIAL_NAME | &quot;SpecialName&quot; |
| RT_SPECIAL_NAME | &quot;RTSpecialName&quot; |
| PINVOKE_IMPL | &quot;PinvokeImpl&quot; |
| HAS_SECURITY | &quot;HasSecurity&quot; |
| REQUIRE_SEC_OBJECT | &quot;RequireSecObject&quot; |
| RESERVED_MASK | &quot;ReservedMask&quot; |



## Enum: MethodImplementationFlagsEnum

| Name | Value |
|---- | -----|
| IL | &quot;IL&quot; |
| NATIVE | &quot;Native&quot; |
| OPTIL | &quot;OPTIL&quot; |
| CODE_TYPE_MASK | &quot;CodeTypeMask&quot; |
| MANAGED_MASK | &quot;ManagedMask&quot; |
| NO_INLINING | &quot;NoInlining&quot; |
| FORWARD_REF | &quot;ForwardRef&quot; |
| SYNCHRONIZED | &quot;Synchronized&quot; |
| NO_OPTIMIZATION | &quot;NoOptimization&quot; |
| PRESERVE_SIG | &quot;PreserveSig&quot; |
| AGGRESSIVE_INLINING | &quot;AggressiveInlining&quot; |
| AGGRESSIVE_OPTIMIZATION | &quot;AggressiveOptimization&quot; |
| INTERNAL_CALL | &quot;InternalCall&quot; |
| ASYNC | &quot;Async&quot; |
| MAX_METHOD_IMPL_VAL | &quot;MaxMethodImplVal&quot; |



## Enum: CallingConventionEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;Standard&quot; |
| VAR_ARGS | &quot;VarArgs&quot; |
| ANY | &quot;Any&quot; |
| HAS_THIS | &quot;HasThis&quot; |
| EXPLICIT_THIS | &quot;ExplicitThis&quot; |



## Enum: MemberTypeEnum

| Name | Value |
|---- | -----|
| CONSTRUCTOR | &quot;Constructor&quot; |
| EVENT | &quot;Event&quot; |
| FIELD | &quot;Field&quot; |
| METHOD | &quot;Method&quot; |
| PROPERTY | &quot;Property&quot; |
| TYPE_INFO | &quot;TypeInfo&quot; |
| CUSTOM | &quot;Custom&quot; |
| NESTED_TYPE | &quot;NestedType&quot; |
| ALL | &quot;All&quot; |



