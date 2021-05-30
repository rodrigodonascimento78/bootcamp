package com.project.bootcamptwo.exceptions;

import com.project.bootcamptwo.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
