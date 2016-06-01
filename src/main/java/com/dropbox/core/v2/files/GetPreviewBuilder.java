/* DO NOT EDIT */
/* This file was generated from files.stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxDownloader;
import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxDownloadStyleBuilder;

/**
 * The request builder returned by {@link
 * DbxUserFilesRequests#getPreview(String)}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class GetPreviewBuilder extends DbxDownloadStyleBuilder<FileMetadata> {
    private final DbxUserFilesRequests files_;
    private final String path;
    private String rev;

    /**
     * Creates a new instance of this builder.
     *
     * @param path  The path of the file to preview. Must match pattern "{@code
     *     (/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})}" and not be {@code null}.
     * @param files_  Dropbox namespace-specific client used to issue files
     *     requests.
     *
     * @return instsance of this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    GetPreviewBuilder(DbxUserFilesRequests files_, String path) {
        if (files_ == null) {
            throw new NullPointerException("files_");
        }
        this.files_ = files_;
        this.path = path;
        this.rev = null;
    }

    /**
     * Set value for optional field.
     *
     * @param rev  Deprecated. Please specify revision in the {@code path}
     *     argument to {@link DbxUserFilesRequests#getPreview(String)} instead.
     *     Must have length of at least 9 and match pattern "{@code [0-9a-f]+}".
     *
     * @return this builder
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public GetPreviewBuilder withRev(String rev) {
        if (rev != null) {
            if (rev.length() < 9) {
                throw new IllegalArgumentException("String 'rev' is shorter than 9");
            }
            if (!java.util.regex.Pattern.matches("[0-9a-f]+", rev)) {
                throw new IllegalArgumentException("String 'rev' does not match pattern");
            }
        }
        this.rev = rev;
        return this;
    }

    @Override
    public DbxDownloader<FileMetadata> start() throws PreviewErrorException, DbxException {
        PreviewArg arg_ = new PreviewArg(path, rev);
        return files_.getPreview(arg_, getHeaders());
    }
}
