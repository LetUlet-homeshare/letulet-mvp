package com.letulet.backend.model;

import com.letulet.backend.db.DBUtils;

import java.sql.SQLException;


/**
 * Created by stephan on 13/11/17.
 */
public class SetupWorkflowManager {

    static SetupWorkflowManager instance = null;

    static {
        instance = new SetupWorkflowManager();
    }

    static public SetupWorkflowManager getInstance() {
        return instance;
    }


    public SetupWorkflow createSetupWorkflow(Tenant tenant) {

        try {
            SetupWorkflow setupWorkflow = DBUtils.getEntityManager().create(SetupWorkflow.class);
            setupWorkflow.save();
            return setupWorkflow;

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }
}
