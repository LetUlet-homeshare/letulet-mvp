package com.letulet.backend.db;


import com.letulet.backend.model.Setting;
import com.letulet.backend.model.User;
import net.java.ao.DBParam;

import java.sql.SQLException;

public class SettingManager {

    protected static final String USER_ID = "userID";

	static SettingManager instance = null;

    static {
		instance = new SettingManager();
	}

	static public SettingManager getInstance() {
		return instance;
	}


    public Setting createSetting(User user) {

        try {
            Setting setting = DBUtils.getEntityManager().create(Setting.class, new DBParam(USER_ID, user.getID()));
            setting.setUser(user);

            return setting;

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }

    public Setting getSetting(User user) {

        if(user == null) { throw new IllegalArgumentException(); }

        try {
            Setting[] l = DBUtils.getEntityManager().find(Setting.class, "userID = ?", user);
            if(l.length == 0)
                return null;
            else
                return l[0];

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }


}