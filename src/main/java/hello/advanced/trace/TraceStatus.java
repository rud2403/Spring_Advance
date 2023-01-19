package hello.advanced.trace;

public class TraceStatus {

    private TraceId taTraceId;
    private Long startTimeMs;
    private String message;

    public TraceStatus(TraceId taTraceId, Long startTimeMs, String message) {
        this.taTraceId = taTraceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public TraceId getTraceId() {
        return taTraceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }
}
