package org.geogit.api;

/**
 * Provides committed user name to {@link CommitOp}
 * 
 * @author groldan
 * 
 */
public interface CommitStateResolver {

    /**
     * @return {@code null} if annonymous, the name of the current user otherwise
     */
    public String getAuthor();

    public String getCommitMessage();

    public String getCommitter();

    public long getCommitTimeMillis();
}