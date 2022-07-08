package com.demo.portlet;

import com.demo.constants.DemoPortletKeys;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.test.model.Employee;
import com.test.model.Father;
import com.test.service.EmployeeLocalService;
import com.test.service.FatherLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.List;

/**
 * @author MalicYur
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=Demo",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + DemoPortletKeys.DEMO,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class DemoPortlet extends MVCPortlet {

    @Reference
    private FatherLocalService _fatherLocalService;

    @Reference
    private EmployeeLocalService employeeLocalService;

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        System.out.println("start demo ......................");

//		Father father = _fatherLocalService.createFather(CounterLocalServiceUtil.increment());
//		father.setFname("Bob1112");
//		father.setOccupation("job2");
//		_fatherLocalService.addFather(father);
//		System.out.println("Successfully added ...");

//		String fname = _fatherLocalService.findByOccupation("job").get(0).getFname();
//		System.out.println("Successfully added ... "+ fname);

        //String fatherName = _fatherLocalService.getFatherByOccupation("job").get(0).getFname();
        List<Father> fatherList = _fatherLocalService.getFatherByOccupation("job");
        System.out.println("Successfully retrived ... " + fatherList);

//        Employee employee = null;
//        try {
//            employee = employeeLocalService.getEmployee(1);
//        } catch (PortalException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Successfully retrived ... " + employee);


        super.doView(renderRequest, renderResponse);
    }
}