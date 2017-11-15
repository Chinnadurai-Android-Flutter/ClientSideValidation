package com.chinnadurai.validation.utility;

import com.chinnadurai.validation.ValidationHolder;

import java.util.regex.Matcher;

public interface ValidationCallback {

    void execute(ValidationHolder validationHolder, Matcher matcher);

}