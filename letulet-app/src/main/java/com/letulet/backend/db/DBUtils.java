package com.letulet.backend.db;

import com.letulet.backend.model.*;
import com.letulet.backend.model.airbnb.AirbnbUser;
import com.letulet.core.Config;
import com.letulet.utils.Log;
import net.java.ao.DefaultPolymorphicTypeMapper;
import net.java.ao.EntityManager;
import net.java.ao.RawEntity;
import net.java.ao.builder.EntityManagerBuilder;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by stephan on 07/11/17.
 */
public class DBUtils {

    static EntityManager mgr = null;

	public static EntityManager getEntityManager() { //could be made "protected" to prevent access from JSP
		return mgr;
	}

    protected static EntityManager createEntityManager() {

        String dburl = Config.getAsString("jdbc.connectionURL");
        String dbuser = Config.getAsString("jdbc.username");
        String dbpass = Config.getAsString("jdbc.password");
        String mcache = Config.getAsString("memcached.addr");

        if (dburl == null) throw new RuntimeException("No dburl specified");
        if (dbuser == null) throw new RuntimeException("No dbuser specified");
        if (dbpass == null) throw new RuntimeException("No dbpass specified");

        Logger.getLogger("net.java.ao").setLevel(Level.OFF);
        Logger.getLogger("net.java.ao.EntityManager").setLevel(Level.OFF);

        mgr = EntityManagerBuilder.url(dburl).username(dbuser).password(dbpass).auto().build();
        mgr.setPolymorphicTypeMapper(new DefaultPolymorphicTypeMapper(Tenant.class, Landlord.class));

        return mgr;
    }


    protected static void migrateSchema(EntityManager mgr) {

        try {
            Class<? extends RawEntity<?>>[] entities = new Class[] { User.class, Property.class, Tenant.class, Landlord.class, Agreement.class,
                                                                    Booking.class, Setting.class, BankAccount.class, AirbnbUser.class, Transaction.class};
            mgr.migrate(entities);
        } catch (SQLException e) {
            Log.error(DBUtils.class, "Could not migrate classes: " + e.getMessage());
        }

    }

}
