package org.openstreetmap.atlas.geography.atlas.statistics.coverage.poi;

import java.util.Set;
import java.util.function.Predicate;

import org.openstreetmap.atlas.geography.atlas.Atlas;
import org.openstreetmap.atlas.geography.atlas.items.Edge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Coverage for the name tag
 *
 * @author matthieun
 */
public class EdgesCountCoverage extends CountCoverage<Edge>
{
    private static final Logger logger = LoggerFactory.getLogger(EdgesCountCoverage.class);

    public EdgesCountCoverage(final Atlas atlas)
    {
        super(logger, atlas);
    }

    public EdgesCountCoverage(final Atlas atlas, final Predicate<Edge> filter)
    {
        super(logger, atlas, filter);
    }

    public EdgesCountCoverage(final Logger logger, final Atlas atlas)
    {
        super(logger, atlas);
    }

    public EdgesCountCoverage(final Logger logger, final Atlas atlas, final Predicate<Edge> filter)
    {
        super(logger, atlas, filter);
    }

    @Override
    protected Iterable<Edge> getEntities()
    {
        return getAtlas().edges();
    }

    @Override
    protected boolean isCounted(final Edge edge)
    {
        return true;
    }

    @Override
    protected String type()
    {
        return "edge_count";
    }

    @Override
    protected Set<TagGroup> validKeyValuePairs()
    {
        return null;
    }
}
