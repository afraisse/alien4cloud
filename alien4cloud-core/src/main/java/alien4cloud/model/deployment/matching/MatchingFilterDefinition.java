package alien4cloud.model.deployment.matching;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import alien4cloud.model.components.constraints.IMatchPropertyConstraint;

import com.google.common.collect.Maps;

@Getter
@Setter
public class MatchingFilterDefinition {
    /** Property constraint list by property */
    private Map<String, List<IMatchPropertyConstraint>> properties = Maps.newHashMap();
}
