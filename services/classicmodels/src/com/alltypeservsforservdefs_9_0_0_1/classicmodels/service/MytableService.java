/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.alltypeservsforservdefs_9_0_0_1.classicmodels.Mytable;
import com.alltypeservsforservdefs_9_0_0_1.classicmodels.MytableId;

/**
 * Service object for domain model class {@link Mytable}.
 */
public interface MytableService {

    /**
     * Creates a new Mytable. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Mytable if any.
     *
     * @param mytable Details of the Mytable to be created; value cannot be null.
     * @return The newly created Mytable.
     */
    Mytable create(@Valid Mytable mytable);


	/**
     * Returns Mytable by given id if exists.
     *
     * @param mytableId The id of the Mytable to get; value cannot be null.
     * @return Mytable associated with the given mytableId.
	 * @throws EntityNotFoundException If no Mytable is found.
     */
    Mytable getById(MytableId mytableId);

    /**
     * Find and return the Mytable by given id if exists, returns null otherwise.
     *
     * @param mytableId The id of the Mytable to get; value cannot be null.
     * @return Mytable associated with the given mytableId.
     */
    Mytable findById(MytableId mytableId);

	/**
     * Find and return the list of Mytables by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param mytableIds The id's of the Mytable to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Mytables associated with the given mytableIds.
     */
    List<Mytable> findByMultipleIds(List<MytableId> mytableIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Mytable. It replaces all fields of the existing Mytable with the given mytable.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Mytable if any.
     *
     * @param mytable The details of the Mytable to be updated; value cannot be null.
     * @return The updated Mytable.
     * @throws EntityNotFoundException if no Mytable is found with given input.
     */
    Mytable update(@Valid Mytable mytable);

    /**
     * Deletes an existing Mytable with the given id.
     *
     * @param mytableId The id of the Mytable to be deleted; value cannot be null.
     * @return The deleted Mytable.
     * @throws EntityNotFoundException if no Mytable found with the given id.
     */
    Mytable delete(MytableId mytableId);

    /**
     * Deletes an existing Mytable with the given object.
     *
     * @param mytable The instance of the Mytable to be deleted; value cannot be null.
     */
    void delete(Mytable mytable);

    /**
     * Find all Mytables matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Mytables.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Mytable> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Mytables matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Mytables.
     *
     * @see Pageable
     * @see Page
     */
    Page<Mytable> findAll(String query, Pageable pageable);

    /**
     * Exports all Mytables matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Mytables matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Mytables in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Mytable.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}