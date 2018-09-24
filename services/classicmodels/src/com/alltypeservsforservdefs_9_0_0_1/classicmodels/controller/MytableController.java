/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.runtime.security.xss.XssDisable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.alltypeservsforservdefs_9_0_0_1.classicmodels.Mytable;
import com.alltypeservsforservdefs_9_0_0_1.classicmodels.MytableId;
import com.alltypeservsforservdefs_9_0_0_1.classicmodels.service.MytableService;


/**
 * Controller object for domain model class Mytable.
 * @see Mytable
 */
@RestController("classicmodels.MytableController")
@Api(value = "MytableController", description = "Exposes APIs to work with Mytable resource.")
@RequestMapping("/classicmodels/Mytable")
public class MytableController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MytableController.class);

    @Autowired
	@Qualifier("classicmodels.MytableService")
	private MytableService mytableService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Mytable instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Mytable createMytable(@RequestBody Mytable mytable) {
		LOGGER.debug("Create Mytable with information: {}" , mytable);

		mytable = mytableService.create(mytable);
		LOGGER.debug("Created Mytable with information: {}" , mytable);

	    return mytable;
	}

    @ApiOperation(value = "Returns the Mytable instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Mytable getMytable(@RequestParam("columnB") Integer columnB, @RequestParam("columnA") Integer columnA) {

        MytableId mytableId = new MytableId();
        mytableId.setColumnB(columnB);
        mytableId.setColumnA(columnA);

        LOGGER.debug("Getting Mytable with id: {}" , mytableId);
        Mytable mytable = mytableService.getById(mytableId);
        LOGGER.debug("Mytable details with id: {}" , mytable);

        return mytable;
    }



    @ApiOperation(value = "Updates the Mytable instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Mytable editMytable(@RequestParam("columnB") Integer columnB, @RequestParam("columnA") Integer columnA, @RequestBody Mytable mytable) {

        mytable.setColumnB(columnB);
        mytable.setColumnA(columnA);

        LOGGER.debug("Mytable details with id is updated with: {}" , mytable);

        return mytableService.update(mytable);
    }


    @ApiOperation(value = "Deletes the Mytable instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteMytable(@RequestParam("columnB") Integer columnB, @RequestParam("columnA") Integer columnA) {

        MytableId mytableId = new MytableId();
        mytableId.setColumnB(columnB);
        mytableId.setColumnA(columnA);

        LOGGER.debug("Deleting Mytable with id: {}" , mytableId);
        Mytable mytable = mytableService.delete(mytableId);

        return mytable != null;
    }


    /**
     * @deprecated Use {@link #findMytables(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Mytable instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Mytable> searchMytablesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Mytables list by query filter:{}", (Object) queryFilters);
        return mytableService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Mytable instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Mytable> findMytables(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Mytables list by filter:", query);
        return mytableService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Mytable instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Mytable> filterMytables(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Mytables list by filter", query);
        return mytableService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Downloadable exportMytables(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return mytableService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public StringWrapper exportMytablesAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Mytable.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> mytableService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Mytable instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Long countMytables( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Mytables");
		return mytableService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Page<Map<String, Object>> getMytableAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return mytableService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service MytableService instance
	 */
	protected void setMytableService(MytableService service) {
		this.mytableService = service;
	}

}