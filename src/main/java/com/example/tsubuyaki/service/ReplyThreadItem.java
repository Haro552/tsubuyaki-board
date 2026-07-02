package com.example.tsubuyaki.service;

import com.example.tsubuyaki.domain.Reply;

public record ReplyThreadItem(Reply reply, int depth, boolean replyFormAvailable) {

    public ReplyThreadItem(Reply reply, int depth) {
        this(reply, depth, true);
    }
}
