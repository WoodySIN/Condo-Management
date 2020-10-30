package condoManagement.controller;

import static java.util.Objects.requireNonNull;

public class QueryResult {
    public final String feedbackToUser;

    public QueryResult(String feedbackToUser) {
        this.feedbackToUser = requireNonNull(feedbackToUser);
    }

}
