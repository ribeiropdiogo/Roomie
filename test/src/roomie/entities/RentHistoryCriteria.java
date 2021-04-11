/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: vr(Universidade do Minho)
 * License Type: Academic
 */
package roomie.entities;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class RentHistoryCriteria extends AbstractORMCriteria {
	public final IntegerExpression houseId;
	public final AssociationExpression house;
	public final IntegerExpression tenantId;
	public final AssociationExpression tenant;
	public final DateExpression bDate;
	public final DateExpression eDate;
	
	public RentHistoryCriteria(Criteria criteria) {
		super(criteria);
		houseId = new IntegerExpression("house.id", this);
		house = new AssociationExpression("house", this);
		tenantId = new IntegerExpression("tenant.id", this);
		tenant = new AssociationExpression("tenant", this);
		bDate = new DateExpression("bDate", this);
		eDate = new DateExpression("eDate", this);
	}
	
	public RentHistoryCriteria(PersistentSession session) {
		this(session.createCriteria(RentHistory.class));
	}
	
	public RentHistoryCriteria() throws PersistentException {
		this(RoomiePersistentManager.instance().getSession());
	}
	
	public HouseCriteria createHouseCriteria() {
		return new HouseCriteria(createCriteria("house"));
	}
	
	public TenantCriteria createTenantCriteria() {
		return new TenantCriteria(createCriteria("tenant"));
	}
	
	public RentHistory uniqueRentHistory() {
		return (RentHistory) super.uniqueResult();
	}
	
	public RentHistory[] listRentHistory() {
		java.util.List list = super.list();
		return (RentHistory[]) list.toArray(new RentHistory[list.size()]);
	}
}
