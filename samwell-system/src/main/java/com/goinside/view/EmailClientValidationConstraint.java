package com.goinside.view;

import java.util.HashMap;
import java.util.Map;

import javax.validation.metadata.ConstraintDescriptor;

import org.primefaces.validate.bean.ClientValidationConstraint;

public class EmailClientValidationConstraint implements ClientValidationConstraint {

	public static final String MESSAGE_METADATA = "data-p-email-msg";

	public Map<String, Object> getMetadata(ConstraintDescriptor constraintDescriptor) {
		Map<String, Object> metadata = new HashMap<String, Object>();
		Map attrs = constraintDescriptor.getAttributes();
		Object message = attrs.get("message");
		if (message != null) {
			metadata.put(MESSAGE_METADATA, message);
		}

		return metadata;
	}

	public String getValidatorId() {
		return Email.class.getSimpleName();
	}

}