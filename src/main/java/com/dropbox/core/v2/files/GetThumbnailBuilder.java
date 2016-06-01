/* DO NOT EDIT */
/* This file was generated from files.stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxDownloader;
import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxDownloadStyleBuilder;

/**
 * The request builder returned by {@link
 * DbxUserFilesRequests#getThumbnailBuilder(String)}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class GetThumbnailBuilder extends DbxDownloadStyleBuilder<FileMetadata> {
    private final DbxUserFilesRequests files_;
    private final ThumbnailArg.Builder thumbnailArgBuilder;

    /**
     * Creates a new instance of this builder.
     *
     * @param files_  Dropbox namespace-specific client used to issue files
     *     requests.
     * @param thumbnailArgBuilder  Request argument builder.
     *
     * @return instsance of this builder
     */
    GetThumbnailBuilder(DbxUserFilesRequests files_, ThumbnailArg.Builder thumbnailArgBuilder) {
        if (files_ == null) {
            throw new NullPointerException("files_");
        }
        this.files_ = files_;
        if (thumbnailArgBuilder == null) {
            throw new NullPointerException("thumbnailArgBuilder");
        }
        this.thumbnailArgBuilder = thumbnailArgBuilder;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code
     * ThumbnailFormat.JPEG}. </p>
     *
     * @param format  The format for the thumbnail image, jpeg (default) or png.
     *     For  images that are photos, jpeg should be preferred, while png is
     *     better for screenshots and digital arts. Defaults to {@code
     *     ThumbnailFormat.JPEG} when set to {@code null}.
     *
     * @return this builder
     */
    public GetThumbnailBuilder withFormat(ThumbnailFormat format) {
        this.thumbnailArgBuilder.withFormat(format);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code
     * ThumbnailSize.W64H64}. </p>
     *
     * @param size  The size for the thumbnail image. Defaults to {@code
     *     ThumbnailSize.W64H64} when set to {@code null}.
     *
     * @return this builder
     */
    public GetThumbnailBuilder withSize(ThumbnailSize size) {
        this.thumbnailArgBuilder.withSize(size);
        return this;
    }

    @Override
    public DbxDownloader<FileMetadata> start() throws ThumbnailErrorException, DbxException {
        ThumbnailArg arg_ = this.thumbnailArgBuilder.build();
        return files_.getThumbnail(arg_, getHeaders());
    }
}
