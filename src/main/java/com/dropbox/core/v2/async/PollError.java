/* DO NOT EDIT */
/* This file was generated from async.stone */

package com.dropbox.core.v2.async;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * Error returned by methods for polling the status of asynchronous job.
 */
public enum PollError {
    // union PollError
    /**
     * The job ID is invalid.
     */
    INVALID_ASYNC_JOB_ID,
    /**
     * Something went wrong with the job on Dropbox's end. You'll need to verify
     * that the action you were taking succeeded, and if not, try again. This
     * should happen very rarely.
     */
    INTERNAL_ERROR,
    /**
     * An unspecified error.
     */
    OTHER; // *catch_all

    /**
     * For internal use only.
     */
    public static final class Serializer extends UnionSerializer<PollError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(PollError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case INVALID_ASYNC_JOB_ID: {
                    g.writeString("invalid_async_job_id");
                    break;
                }
                case INTERNAL_ERROR: {
                    g.writeString("internal_error");
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public PollError deserialize(JsonParser p) throws IOException, JsonParseException {
            PollError value;
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
            else if ("invalid_async_job_id".equals(tag)) {
                value = PollError.INVALID_ASYNC_JOB_ID;
            }
            else if ("internal_error".equals(tag)) {
                value = PollError.INTERNAL_ERROR;
            }
            else {
                value = PollError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
