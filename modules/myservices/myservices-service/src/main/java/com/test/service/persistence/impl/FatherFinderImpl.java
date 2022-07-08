package com.test.service.persistence.impl;


import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.test.model.Father;
import com.test.model.impl.FatherImpl;
import com.test.service.persistence.FatherFinder;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Collections;
import java.util.List;

@Component(service = FatherFinder.class)
public class FatherFinderImpl extends FatherFinderBaseImpl implements FatherFinder {

    @Reference
    private CustomSQL customSQL;

    public List<Father> getFatherByOccupation(String occupation) {
        Session session = null;
        List<Father> fatherList = Collections.emptyList();
        try {
            session = openSession();
            String sql = customSQL.get(getClass(), "getResultByOccupation");
            System.out.println("Sql ====>" + sql);
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.setCacheable(false);
            sqlQuery.addEntity("Father", FatherImpl.class);
            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(occupation);
            fatherList = (List<Father>) sqlQuery.list();
            return fatherList;

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            closeSession(session);
        }
        return fatherList;
    }


}
