package woodspring.springmongo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection="KronosDump")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AD_Data {
	
	//DN|objectClass|ou|distinguishedName|instanceType|whenCreated|whenChanged|uSNCreated|uSNChanged|name|objectGUID|objectCategory|gPLink|dSCorePropagationData|cn|sn|title|physicalDeliveryOfficeName|telephoneNumber|givenName|displayName|memberOf|department|proxyAddresses|directReports|employeeNumber|userAccountControl|badPwdCount|codePage|countryCode|badPasswordTime|lastLogoff|lastLogon|pwdLastSet|primaryGroupID|userParameters|objectSid|accountExpires|logonCount|sAMAccountName|division|sAMAccountType|showInAddressBook|managedObjects|legacyExchangeDN|userPrincipalName|lockoutTime|mS-DS-ConsistencyGuid|lastLogonTimestamp|msTSExpireDate|msTSLicenseVersion|msTSManagingLS|mail|manager|mobile|departmentNumber|msExchArchiveQuota|msExchArchiveWarnQuota|targetAddress|msExchBlockedSendersHash|publicDelegates|msExchRemoteRecipientType|msExchPoliciesIncluded|msExchDelegateListBL|msExchRecipientDisplayType|msExchRecipientTypeDetails|msExchELCMailboxFlags|msExchMailboxTemplateLink|msExchUMDtmfMap|msExchMailboxGuid|msExchSafeSendersHash|extensionAttribute1|msExchMobileAllowedDeviceIDs|msExchMobileMailboxPolicyLink|msExchTextMessagingState|msExchCoManagedObjectsBL|msExchMobileMailboxFlags|publicDelegatesBL|msExchUserAccountControl|crnrTicketKey|msExchWhenMailboxCreated|msExchArchiveGUID|mailNickname|msExchVersion|msExchArchiveName|msExchObjectsDeletedThisPeriod|garbageCollPeriod|homeMDB|msExchMailboxSecurityDescriptor|msExchMDBRulesQuota|homeMTA|msExchHomeServerName|internetEncoding|msExchRBACPolicyLink|msExchUserCulture|mDBUseDefaults|protocolSettings|msExchAddressBookFlags|msExchUMEnabledFlags2|msExchModerationFlags|msExchMailboxMoveFlags|msExchMailboxMoveStatus|msExchProvisioningFlags|msExchMailboxAuditEnable|msExchMailboxMoveTargetMDBLink|msExchBypassAudit|msExchMailboxAuditLogAgeLimit|msExchTransportRecipientSettingsFlags|msExchMailboxMoveSourceMDBLink|msExchDumpsterQuota|msExchDumpsterWarningQuota|facsimileTelephoneNumber|lastKnownParent|extensionAttribute13|msDS-SupportedEncryptionTypes|logonHours|description|sIDHistory|mDBStorageQuota|msExchDelegateListLink|employeeID|msNPAllowDialin|extensionAttribute12|msExchShadowProxyAddresses|pager|operatorCount|adminCount|homePhone|initials|msExchMailboxMoveRemoteHostName|houseIdentifier|otherTelephone|roomNumber|mSMQSignCertificates|mSMQDigests|member|managedBy|groupType|msExchArbitrationMailbox|msExchPoliciesExcluded|reportToOriginator|msRTCSIP-FederationEnabled|msRTCSIP-Line|msRTCSIP-UserEnabled|msRTCSIP-PrimaryHomeServer|msRTCSIP-InternetAccessEnabled|msRTCSIP-OptionFlags|msRTCSIP-PrimaryUserAddress|msRTCSIP-DeploymentLocator|msRTCSIP-UserPolicies|streetAddress|msExchGroupJoinRestriction|msExchCoManagedByLink|msExchRequireAuthToSendTo|msExchGroupDepartRestriction|c|l|st|postalCode|co|otherFacsimileTelephoneNumber|altRecipientBL|extensionAttribute14|msExchHideFromAddressLists|userCertificate|msExchThrottlingPolicyDN|displayNamePrintable|authOrigBL|msExchMasterAccountSid|msExchSharingPartnerIdentities|altRecipient|deliverAndRedirect|scriptPath|msExchRecipLimit|msExchResourceDisplay|msExchResourceMetaData|msExchResourceSearchProperties|delivContLength|submissionContLength|msExchShadowMailNickname|msExchArchiveDatabaseLink|msExchUMOperatorNumber|company|msDS-LastKnownRDN|msExchMailboxMoveSourceUserBL|msExchSafeRecipientsHash|msExchOmaAdminWirelessEnable|localPolicyFlags|operatingSystem|operatingSystemVersion|operatingSystemServicePack|dNSHostName|servicePrincipalName|isCriticalSystemObject
	@Id
	public ObjectId _id;
	
	@Indexed(unique=true)
	private Integer ckId;

	private String firstName;

	private String lastName;

	private String telphone;

}
