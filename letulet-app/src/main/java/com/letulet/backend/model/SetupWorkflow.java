package com.letulet.backend.model;

import net.java.ao.Entity;
import net.java.ao.schema.Default;

/**
 * Created by stephan on 13/11/17.
 */
public interface SetupWorkflow extends Entity {

    @Default("1")        // example: 15 for 3pm
    void setCurrentStep(int currentStep);
    public int getCurrentStep();


}
