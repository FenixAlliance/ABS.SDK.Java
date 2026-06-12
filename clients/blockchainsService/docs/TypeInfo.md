

# TypeInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] [readonly] |
|**customAttributes** | [**List&lt;CustomAttributeData&gt;**](CustomAttributeData.md) |  |  [optional] [readonly] |
|**isCollectible** | **Boolean** |  |  [optional] [readonly] |
|**metadataToken** | **Integer** |  |  [optional] [readonly] |
|**memberType** | [**MemberTypeEnum**](#MemberTypeEnum) |  |  [optional] [readonly] |
|**namespace** | **String** |  |  [optional] [readonly] |
|**assemblyQualifiedName** | **String** |  |  [optional] [readonly] |
|**fullName** | **String** |  |  [optional] [readonly] |
|**assembly** | [**Assembly**](Assembly.md) |  |  [optional] |
|**module** | [**Module**](Module.md) |  |  [optional] |
|**isInterface** | **Boolean** |  |  [optional] [readonly] |
|**isNested** | **Boolean** |  |  [optional] [readonly] |
|**declaringType** | [**Type**](Type.md) |  |  [optional] |
|**declaringMethod** | [**MethodBase**](MethodBase.md) |  |  [optional] |
|**reflectedType** | [**Type**](Type.md) |  |  [optional] |
|**underlyingSystemType** | [**Type**](Type.md) |  |  [optional] |
|**isTypeDefinition** | **Boolean** |  |  [optional] [readonly] |
|**isArray** | **Boolean** |  |  [optional] [readonly] |
|**isByRef** | **Boolean** |  |  [optional] [readonly] |
|**isPointer** | **Boolean** |  |  [optional] [readonly] |
|**isConstructedGenericType** | **Boolean** |  |  [optional] [readonly] |
|**isGenericParameter** | **Boolean** |  |  [optional] [readonly] |
|**isGenericTypeParameter** | **Boolean** |  |  [optional] [readonly] |
|**isGenericMethodParameter** | **Boolean** |  |  [optional] [readonly] |
|**isGenericType** | **Boolean** |  |  [optional] [readonly] |
|**isGenericTypeDefinition** | **Boolean** |  |  [optional] [readonly] |
|**isSZArray** | **Boolean** |  |  [optional] [readonly] |
|**isVariableBoundArray** | **Boolean** |  |  [optional] [readonly] |
|**isByRefLike** | **Boolean** |  |  [optional] [readonly] |
|**isFunctionPointer** | **Boolean** |  |  [optional] [readonly] |
|**isUnmanagedFunctionPointer** | **Boolean** |  |  [optional] [readonly] |
|**hasElementType** | **Boolean** |  |  [optional] [readonly] |
|**genericTypeArguments** | [**List&lt;Type&gt;**](Type.md) |  |  [optional] [readonly] |
|**genericParameterPosition** | **Integer** |  |  [optional] [readonly] |
|**genericParameterAttributes** | [**GenericParameterAttributesEnum**](#GenericParameterAttributesEnum) |  |  [optional] [readonly] |
|**attributes** | [**AttributesEnum**](#AttributesEnum) |  |  [optional] [readonly] |
|**isAbstract** | **Boolean** |  |  [optional] [readonly] |
|**isImport** | **Boolean** |  |  [optional] [readonly] |
|**isSealed** | **Boolean** |  |  [optional] [readonly] |
|**isSpecialName** | **Boolean** |  |  [optional] [readonly] |
|**isClass** | **Boolean** |  |  [optional] [readonly] |
|**isNestedAssembly** | **Boolean** |  |  [optional] [readonly] |
|**isNestedFamANDAssem** | **Boolean** |  |  [optional] [readonly] |
|**isNestedFamily** | **Boolean** |  |  [optional] [readonly] |
|**isNestedFamORAssem** | **Boolean** |  |  [optional] [readonly] |
|**isNestedPrivate** | **Boolean** |  |  [optional] [readonly] |
|**isNestedPublic** | **Boolean** |  |  [optional] [readonly] |
|**isNotPublic** | **Boolean** |  |  [optional] [readonly] |
|**isPublic** | **Boolean** |  |  [optional] [readonly] |
|**isAutoLayout** | **Boolean** |  |  [optional] [readonly] |
|**isExplicitLayout** | **Boolean** |  |  [optional] [readonly] |
|**isLayoutSequential** | **Boolean** |  |  [optional] [readonly] |
|**isAnsiClass** | **Boolean** |  |  [optional] [readonly] |
|**isAutoClass** | **Boolean** |  |  [optional] [readonly] |
|**isUnicodeClass** | **Boolean** |  |  [optional] [readonly] |
|**isCOMObject** | **Boolean** |  |  [optional] [readonly] |
|**isContextful** | **Boolean** |  |  [optional] [readonly] |
|**isEnum** | **Boolean** |  |  [optional] [readonly] |
|**isMarshalByRef** | **Boolean** |  |  [optional] [readonly] |
|**isPrimitive** | **Boolean** |  |  [optional] [readonly] |
|**isValueType** | **Boolean** |  |  [optional] [readonly] |
|**isSignatureType** | **Boolean** |  |  [optional] [readonly] |
|**isSecurityCritical** | **Boolean** |  |  [optional] [readonly] |
|**isSecuritySafeCritical** | **Boolean** |  |  [optional] [readonly] |
|**isSecurityTransparent** | **Boolean** |  |  [optional] [readonly] |
|**structLayoutAttribute** | [**StructLayoutAttribute**](StructLayoutAttribute.md) |  |  [optional] |
|**typeInitializer** | [**ConstructorInfo**](ConstructorInfo.md) |  |  [optional] |
|**typeHandle** | [**RuntimeTypeHandle**](RuntimeTypeHandle.md) |  |  [optional] |
|**guid** | **UUID** |  |  [optional] [readonly] |
|**baseType** | [**Type**](Type.md) |  |  [optional] |
|**isSerializable** | **Boolean** |  |  [optional] [readonly] |
|**containsGenericParameters** | **Boolean** |  |  [optional] [readonly] |
|**isVisible** | **Boolean** |  |  [optional] [readonly] |
|**genericTypeParameters** | [**List&lt;Type&gt;**](Type.md) |  |  [optional] [readonly] |
|**declaredConstructors** | [**List&lt;ConstructorInfo&gt;**](ConstructorInfo.md) |  |  [optional] [readonly] |
|**declaredEvents** | [**List&lt;EventInfo&gt;**](EventInfo.md) |  |  [optional] [readonly] |
|**declaredFields** | [**List&lt;FieldInfo&gt;**](FieldInfo.md) |  |  [optional] [readonly] |
|**declaredMembers** | [**List&lt;MemberInfo&gt;**](MemberInfo.md) |  |  [optional] [readonly] |
|**declaredMethods** | [**List&lt;MethodInfo&gt;**](MethodInfo.md) |  |  [optional] [readonly] |
|**declaredNestedTypes** | [**List&lt;TypeInfo&gt;**](TypeInfo.md) |  |  [optional] [readonly] |
|**declaredProperties** | [**List&lt;PropertyInfo&gt;**](PropertyInfo.md) |  |  [optional] [readonly] |
|**implementedInterfaces** | [**List&lt;Type&gt;**](Type.md) |  |  [optional] [readonly] |



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



## Enum: GenericParameterAttributesEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| COVARIANT | &quot;Covariant&quot; |
| CONTRAVARIANT | &quot;Contravariant&quot; |
| VARIANCE_MASK | &quot;VarianceMask&quot; |
| REFERENCE_TYPE_CONSTRAINT | &quot;ReferenceTypeConstraint&quot; |
| NOT_NULLABLE_VALUE_TYPE_CONSTRAINT | &quot;NotNullableValueTypeConstraint&quot; |
| DEFAULT_CONSTRUCTOR_CONSTRAINT | &quot;DefaultConstructorConstraint&quot; |
| SPECIAL_CONSTRAINT_MASK | &quot;SpecialConstraintMask&quot; |
| ALLOW_BY_REF_LIKE | &quot;AllowByRefLike&quot; |



## Enum: AttributesEnum

| Name | Value |
|---- | -----|
| NOT_PUBLIC | &quot;NotPublic&quot; |
| PUBLIC | &quot;Public&quot; |
| NESTED_PUBLIC | &quot;NestedPublic&quot; |
| NESTED_PRIVATE | &quot;NestedPrivate&quot; |
| NESTED_FAMILY | &quot;NestedFamily&quot; |
| NESTED_ASSEMBLY | &quot;NestedAssembly&quot; |
| NESTED_FAM_AND_ASSEM | &quot;NestedFamANDAssem&quot; |
| VISIBILITY_MASK | &quot;VisibilityMask&quot; |
| SEQUENTIAL_LAYOUT | &quot;SequentialLayout&quot; |
| EXPLICIT_LAYOUT | &quot;ExplicitLayout&quot; |
| LAYOUT_MASK | &quot;LayoutMask&quot; |
| INTERFACE | &quot;Interface&quot; |
| ABSTRACT | &quot;Abstract&quot; |
| SEALED | &quot;Sealed&quot; |
| SPECIAL_NAME | &quot;SpecialName&quot; |
| RT_SPECIAL_NAME | &quot;RTSpecialName&quot; |
| IMPORT | &quot;Import&quot; |
| SERIALIZABLE | &quot;Serializable&quot; |
| WINDOWS_RUNTIME | &quot;WindowsRuntime&quot; |
| UNICODE_CLASS | &quot;UnicodeClass&quot; |
| AUTO_CLASS | &quot;AutoClass&quot; |
| STRING_FORMAT_MASK | &quot;StringFormatMask&quot; |
| HAS_SECURITY | &quot;HasSecurity&quot; |
| RESERVED_MASK | &quot;ReservedMask&quot; |
| BEFORE_FIELD_INIT | &quot;BeforeFieldInit&quot; |
| CUSTOM_FORMAT_MASK | &quot;CustomFormatMask&quot; |



