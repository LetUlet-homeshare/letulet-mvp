package com.letulet.backend.db;

import com.letulet.utils.Log;
import net.java.ao.EntityManager;

/**
 * Created by stephan on 07/11/17.
 */
public class Initializer {

    public static void init() {

        EntityManager mgr = null;

        try {
            mgr = DBUtils.createEntityManager();
        } catch (Exception e) {
            Log.error(Initializer.class, "Could not migrate classes: " + e.getMessage());
        }

        Log.info(Initializer.class, "EntityManager initialized successfully");

        try {
            if(mgr != null) {
                DBUtils.migrateSchema(mgr);
            }
        } catch (Exception e) {
            Log.error(Initializer.class, "Could not migrate classes: " + e.getMessage());
        }

        Log.info(Initializer.class, "Schema updated successfully");

    }



}