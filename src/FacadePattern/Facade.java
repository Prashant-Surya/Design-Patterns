package FacadePattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Facade {
    List<Criteria> criterias;
    protected Facade() {
        criterias = new ArrayList<>();
    }
    public void addCriteria(Criteria criteria) {
        criterias.add(criteria);
    }

    public boolean canBeProcessed() {
        for(Criteria criteria: criterias) {
            if (!criteria.conditionSatisfied()) {
                return false;
            }
        }
        return true;
    }

    protected abstract void initialCriterias();
}
