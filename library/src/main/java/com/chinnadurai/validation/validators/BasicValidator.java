package com.chinnadurai.validation.validators;

import com.chinnadurai.validation.ValidationHolder;
import com.chinnadurai.validation.utility.ValidationCallback;

import java.util.regex.Matcher;

public class BasicValidator extends Validator {

    private ValidationCallback mValidationCallback = new ValidationCallback() {
        @Override
        public void execute(ValidationHolder validationHolder, Matcher matcher) {
            validationHolder.getEditText().setError(validationHolder.getErrMsg());
        }
    };

    @Override
    public boolean trigger() {
        return checkFields(mValidationCallback);
    }

    @Override
    public void halt() {
        for (ValidationHolder validationHolder : mValidationHolderList) {
            validationHolder.getEditText().setError(null);
        }
    }

}