package org.oasis_open.contextserver.api.services;

import org.oasis_open.contextserver.api.Metadata;
import org.oasis_open.contextserver.api.PartialList;
import org.oasis_open.contextserver.api.Profile;
import org.oasis_open.contextserver.api.campaigns.Campaign;
import org.oasis_open.contextserver.api.goals.Goal;
import org.oasis_open.contextserver.api.goals.GoalReport;
import org.oasis_open.contextserver.api.query.AggregateQuery;

import java.util.Set;

public interface GoalsService {
    Set<Metadata> getGoalMetadatas();

    Set<Metadata> getGoalMetadatas(String scope);

    Goal getGoal(String scope, String goalId);

    Set<Metadata> getCampaignGoalMetadatas(String campaignId);

    void setGoal(Goal goal);

    void removeGoal(String scope, String goalId);

    GoalReport getGoalReport(String scope, String goalId);

    GoalReport getGoalReport(String scope, String goalId, AggregateQuery query);

    Set<Metadata> getCampaignMetadatas();

    Set<Metadata> getCampaignMetadatas(String scope);

    Campaign getCampaign(String scope, String campaignId);

    void setCampaign(Campaign campaign);

    void removeCampaign(String scope, String campaignId);


    PartialList<Profile> getMatchingIndividuals(String scope, String campaignId, int offset, int size, String sortBy);

    long getMatchingIndividualsCount(String scope, String campaignId);
}
