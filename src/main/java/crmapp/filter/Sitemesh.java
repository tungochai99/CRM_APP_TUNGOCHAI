package crmapp.filter;

import javax.servlet.annotation.WebFilter;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

import crmapp.util.PathUtils;

@WebFilter(filterName = "sitemesh", urlPatterns = PathUtils.ROOT)
public class Sitemesh extends SiteMeshFilter {
	
}
