/* DO NOT EDIT */
/* This file was generated from sharing_folders.stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * This class is an open tagged union.  Tagged unions instances are always
 * associated to a specific tag.  This means only one of the {@code isAbc()}
 * methods will return {@code true}. You can use {@link #tag()} to determine the
 * tag associated with this instance.
 *
 * <p> Open unions may be extended in the future with additional tags. If a new
 * tag is introduced that this SDK does not recognized, the {@link #OTHER} value
 * will be used. </p>
 */
public final class RemoveFolderMemberError {
    // union RemoveFolderMemberError

    /**
     * Discriminating tag type for {@link RemoveFolderMemberError}.
     */
    public enum Tag {
        ACCESS_ERROR, // SharedFolderAccessError
        MEMBER_ERROR, // SharedFolderMemberError
        /**
         * The target user is the owner of the shared folder. You can't remove
         * this user until ownership has been transferred to another member.
         */
        FOLDER_OWNER,
        /**
         * The target user has access to the shared folder via a group.
         */
        GROUP_ACCESS,
        /**
         * This action cannot be performed on a team shared folder.
         */
        TEAM_FOLDER,
        /**
         * The current user does not have permission to perform this action.
         */
        NO_PERMISSION,
        /**
         * Catch-all used for unknown tag values returned by the Dropbox
         * servers.
         *
         * <p> Receiving a catch-all value typically indicates this SDK version
         * is not up to date. Consider updating your SDK version to handle the
         * new tags. </p>
         */
        OTHER; // *catch_all
    }

    /**
     * The target user is the owner of the shared folder. You can't remove this
     * user until ownership has been transferred to another member.
     */
    public static final RemoveFolderMemberError FOLDER_OWNER = new RemoveFolderMemberError(Tag.FOLDER_OWNER, null, null);
    /**
     * The target user has access to the shared folder via a group.
     */
    public static final RemoveFolderMemberError GROUP_ACCESS = new RemoveFolderMemberError(Tag.GROUP_ACCESS, null, null);
    /**
     * This action cannot be performed on a team shared folder.
     */
    public static final RemoveFolderMemberError TEAM_FOLDER = new RemoveFolderMemberError(Tag.TEAM_FOLDER, null, null);
    /**
     * The current user does not have permission to perform this action.
     */
    public static final RemoveFolderMemberError NO_PERMISSION = new RemoveFolderMemberError(Tag.NO_PERMISSION, null, null);
    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    public static final RemoveFolderMemberError OTHER = new RemoveFolderMemberError(Tag.OTHER, null, null);

    private final Tag tag;
    private final SharedFolderAccessError accessErrorValue;
    private final SharedFolderMemberError memberErrorValue;

    /**
     *
     * @param tag  Discriminating tag for this instance.
     */
    private RemoveFolderMemberError(Tag tag, SharedFolderAccessError accessErrorValue, SharedFolderMemberError memberErrorValue) {
        this.tag = tag;
        this.accessErrorValue = accessErrorValue;
        this.memberErrorValue = memberErrorValue;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  This means only one of the {@code isXyz()}
     * methods will return {@code true}. Callers are recommended to use the tag
     * value in a {@code switch} statement to properly handle the different
     * values for this {@code RemoveFolderMemberError}. </p>
     *
     * <p> If a tag returned by the server is unrecognized by this SDK, the
     * {@link Tag#OTHER} value will be used. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#ACCESS_ERROR}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#ACCESS_ERROR}, {@code false} otherwise.
     */
    public boolean isAccessError() {
        return this.tag == Tag.ACCESS_ERROR;
    }

    /**
     * Returns an instance of {@code RemoveFolderMemberError} that has its tag
     * set to {@link Tag#ACCESS_ERROR}.
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code RemoveFolderMemberError} with its tag set to
     *     {@link Tag#ACCESS_ERROR}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static RemoveFolderMemberError accessError(SharedFolderAccessError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new RemoveFolderMemberError(Tag.ACCESS_ERROR, value, null);
    }

    /**
     * This instance must be tagged as {@link Tag#ACCESS_ERROR}.
     *
     * @return The {@link RemoveFolderMemberError#accessError} value associated
     *     with this instance if {@link #isAccessError} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isAccessError} is {@code
     *     false}.
     */
    public SharedFolderAccessError getAccessErrorValue() {
        if (this.tag != Tag.ACCESS_ERROR) {
            throw new IllegalStateException("Invalid tag: required Tag.ACCESS_ERROR, but was Tag." + tag.name());
        }
        return accessErrorValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#MEMBER_ERROR}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#MEMBER_ERROR}, {@code false} otherwise.
     */
    public boolean isMemberError() {
        return this.tag == Tag.MEMBER_ERROR;
    }

    /**
     * Returns an instance of {@code RemoveFolderMemberError} that has its tag
     * set to {@link Tag#MEMBER_ERROR}.
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code RemoveFolderMemberError} with its tag set to
     *     {@link Tag#MEMBER_ERROR}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static RemoveFolderMemberError memberError(SharedFolderMemberError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new RemoveFolderMemberError(Tag.MEMBER_ERROR, null, value);
    }

    /**
     * This instance must be tagged as {@link Tag#MEMBER_ERROR}.
     *
     * @return The {@link RemoveFolderMemberError#memberError} value associated
     *     with this instance if {@link #isMemberError} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isMemberError} is {@code
     *     false}.
     */
    public SharedFolderMemberError getMemberErrorValue() {
        if (this.tag != Tag.MEMBER_ERROR) {
            throw new IllegalStateException("Invalid tag: required Tag.MEMBER_ERROR, but was Tag." + tag.name());
        }
        return memberErrorValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#FOLDER_OWNER}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#FOLDER_OWNER}, {@code false} otherwise.
     */
    public boolean isFolderOwner() {
        return this.tag == Tag.FOLDER_OWNER;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#GROUP_ACCESS}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#GROUP_ACCESS}, {@code false} otherwise.
     */
    public boolean isGroupAccess() {
        return this.tag == Tag.GROUP_ACCESS;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#TEAM_FOLDER}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#TEAM_FOLDER}, {@code false} otherwise.
     */
    public boolean isTeamFolder() {
        return this.tag == Tag.TEAM_FOLDER;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#NO_PERMISSION}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#NO_PERMISSION}, {@code false} otherwise.
     */
    public boolean isNoPermission() {
        return this.tag == Tag.NO_PERMISSION;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#OTHER},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#OTHER},
     *     {@code false} otherwise.
     */
    public boolean isOther() {
        return this.tag == Tag.OTHER;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            tag,
            accessErrorValue,
            memberErrorValue
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj instanceof RemoveFolderMemberError) {
            RemoveFolderMemberError other = (RemoveFolderMemberError) obj;
            if (this.tag != other.tag) {
                return false;
            }
            switch (tag) {
                case ACCESS_ERROR:
                    return (this.accessErrorValue == other.accessErrorValue) || (this.accessErrorValue.equals(other.accessErrorValue));
                case MEMBER_ERROR:
                    return (this.memberErrorValue == other.memberErrorValue) || (this.memberErrorValue.equals(other.memberErrorValue));
                case FOLDER_OWNER:
                    return true;
                case GROUP_ACCESS:
                    return true;
                case TEAM_FOLDER:
                    return true;
                case NO_PERMISSION:
                    return true;
                case OTHER:
                    return true;
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static final class Serializer extends UnionSerializer<RemoveFolderMemberError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(RemoveFolderMemberError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value.tag()) {
                case ACCESS_ERROR: {
                    g.writeStartObject();
                    writeTag("access_error", g);
                    g.writeFieldName("access_error");
                    SharedFolderAccessError.Serializer.INSTANCE.serialize(value.accessErrorValue, g);
                    g.writeEndObject();
                    break;
                }
                case MEMBER_ERROR: {
                    g.writeStartObject();
                    writeTag("member_error", g);
                    g.writeFieldName("member_error");
                    SharedFolderMemberError.Serializer.INSTANCE.serialize(value.memberErrorValue, g);
                    g.writeEndObject();
                    break;
                }
                case FOLDER_OWNER: {
                    g.writeString("folder_owner");
                    break;
                }
                case GROUP_ACCESS: {
                    g.writeString("group_access");
                    break;
                }
                case TEAM_FOLDER: {
                    g.writeString("team_folder");
                    break;
                }
                case NO_PERMISSION: {
                    g.writeString("no_permission");
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public RemoveFolderMemberError deserialize(JsonParser p) throws IOException, JsonParseException {
            RemoveFolderMemberError value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else if ("access_error".equals(tag)) {
                SharedFolderAccessError fieldValue = null;
                expectField("access_error", p);
                fieldValue = SharedFolderAccessError.Serializer.INSTANCE.deserialize(p);
                value = RemoveFolderMemberError.accessError(fieldValue);
            }
            else if ("member_error".equals(tag)) {
                SharedFolderMemberError fieldValue = null;
                expectField("member_error", p);
                fieldValue = SharedFolderMemberError.Serializer.INSTANCE.deserialize(p);
                value = RemoveFolderMemberError.memberError(fieldValue);
            }
            else if ("folder_owner".equals(tag)) {
                value = RemoveFolderMemberError.FOLDER_OWNER;
            }
            else if ("group_access".equals(tag)) {
                value = RemoveFolderMemberError.GROUP_ACCESS;
            }
            else if ("team_folder".equals(tag)) {
                value = RemoveFolderMemberError.TEAM_FOLDER;
            }
            else if ("no_permission".equals(tag)) {
                value = RemoveFolderMemberError.NO_PERMISSION;
            }
            else {
                value = RemoveFolderMemberError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
