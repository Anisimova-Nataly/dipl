package general;

import dao.ListOsmotraDao;
import dao.PhoneConsultationsJournalDao;
import impl.ListOsmotraDaoImpl;

import impl.PhoneConsultationsJournalDaoImpl;
import dao.AddressDao;
import dao.CallDayDao;
import dao.CallPlanningJournalDao;
import dao.ClinicDao;
import dao.ConsultationResultDao;
import dao.ContactDao;
import dao.DateDao;
import dao.DiuresisDao;
import dao.JournalOutpatientReceptionDao;
import impl.CallDayDaoImpl;
import impl.JournalOutpatientReceptionDaoImpl;
import impl.CallPlanningJournalDaoImpl;
import impl.ClinicDaoImpl;
import impl.DateDaoImpl;
import impl.DiuresisDaoImpl;
import impl.EvaluationXbsShvoDaoImpl;
import dao.EvaluationXbsShvoDao;
import dao.HeavyNarcoticJournalDao;
import impl.HeavyNarcoticJournalDaoImpl;
import dao.LiverDao;
import dao.PalpationDao;
import dao.PulseDao;
import dao.ScheduleDao;
import dao.SwallowingActDao;
import dao.TheartDao;
import dao.TherapeuticDiagnosticManipulationsJournalDao;
import dao.PositionDao;
import dao.SpecialistDao;
import impl.SpecialistDaoImpl;
import impl.PositionDaoImpl;
import impl.TherapeuticDiagnosticManipulationsJournalDaoImpl;
import impl.TheartDaoImpl;
import impl.SwallowingActDaoImpl;
import impl.PulseDaoImpl;
import impl.ScheduleDaoImpl;
import impl.PalpationDaoImpl;
import impl.LiverDaoImpl;

public class Factory {

	public static Factory instance = new Factory();
	public DateDao dateDao;
	public AddressDao addressDao;
	public ClinicDao clinicDao;
	public ConsultationResultDao consultationResultDao;
	public ContactDao contactDao;
	public PhoneConsultationsJournalDao zyrnalDao;
	public ListOsmotraDao listDao;
	public CallDayDao callDayDao;
	public JournalOutpatientReceptionDao journalOutpatientReceptionDao;
	public CallPlanningJournalDao callPlanningJournalDao;
	public DiuresisDao diuresisDao;
	public EvaluationXbsShvoDao evaluationXbsShvoDao;
	public HeavyNarcoticJournalDao heavyNarcoticJournalDao;
	public LiverDao liverDao;
	public PalpationDao palpationDao;
	public PulseDao pulseDao;
	public SwallowingActDao swallowingActDao;
	public TheartDao theartDao;
	public TherapeuticDiagnosticManipulationsJournalDao therapeuticDiagnosticManipulationsJournalDao;
	public PositionDao positionDao;
	public SpecialistDao specialistDao;
	public ScheduleDao  scheduleDao;
	private Factory(){};
	public static Factory getInstance(){
		return Factory.instance;
	};
	
	public SpecialistDao getSpecialistDao(){
		if(specialistDao==null)specialistDao = new SpecialistDaoImpl();
		return specialistDao;
		}
	
	public PositionDao getPositionDao(){
		if(positionDao==null)positionDao = new PositionDaoImpl();
		return positionDao;
		}
	
	public TherapeuticDiagnosticManipulationsJournalDao getTherapeuticDiagnosticManipulationsJournalDao(){
		if(therapeuticDiagnosticManipulationsJournalDao==null)therapeuticDiagnosticManipulationsJournalDao = new TherapeuticDiagnosticManipulationsJournalDaoImpl();
		return therapeuticDiagnosticManipulationsJournalDao;
		}
	
	public TheartDao getTheartDao(){
		if(theartDao==null)theartDao = new TheartDaoImpl();
		return theartDao;
		}
	
	public SwallowingActDao getSwallowingActDao(){
		if(swallowingActDao==null)swallowingActDao = new SwallowingActDaoImpl();
		return swallowingActDao;
		}
	
	public PulseDao getPulseDao(){
		if(pulseDao==null)pulseDao = new PulseDaoImpl();
		return pulseDao;
		}
	
	public PalpationDao getPalpationDao(){
		if(palpationDao==null)palpationDao = new PalpationDaoImpl();
		return palpationDao;
		}
	
	public LiverDao getLiverDao(){
		if(liverDao==null)liverDao = new LiverDaoImpl();
		return liverDao;
		}
	
	public HeavyNarcoticJournalDao getHeavyNarcoticJournalDao(){
		if(heavyNarcoticJournalDao==null)heavyNarcoticJournalDao = new HeavyNarcoticJournalDaoImpl();
		return heavyNarcoticJournalDao;
		}
	
	public EvaluationXbsShvoDao getEvaluationXbsShvoDao(){
		if(evaluationXbsShvoDao==null)evaluationXbsShvoDao = new EvaluationXbsShvoDaoImpl();
		return evaluationXbsShvoDao;
		}
	
	public DiuresisDao getDiuresisDao(){
		if(diuresisDao==null)diuresisDao = new DiuresisDaoImpl();
		return diuresisDao;
		}
	
	public CallPlanningJournalDao getCallPlannigJournalDao(){
		if(callPlanningJournalDao==null)callPlanningJournalDao = new CallPlanningJournalDaoImpl();
		return callPlanningJournalDao;
		}
	
	public JournalOutpatientReceptionDao getJournalOutpatientReceptionDao(){
		if(journalOutpatientReceptionDao==null)journalOutpatientReceptionDao = new JournalOutpatientReceptionDaoImpl();
		return journalOutpatientReceptionDao;
		
	}
	
	public PhoneConsultationsJournalDao getPhoneConsultationsJournalDao(){
		if(zyrnalDao==null)zyrnalDao = new PhoneConsultationsJournalDaoImpl();
		return zyrnalDao;
		}


	public ListOsmotraDao getListOsmotraDao(){
		if(listDao==null)listDao = new ListOsmotraDaoImpl();
		return listDao;
	}
	
	public CallDayDao getCallDayDao(){
		if(callDayDao==null)callDayDao = new CallDayDaoImpl();
		return callDayDao;
		}
	public DateDao getDateDao(){
		if(dateDao==null)dateDao = new DateDaoImpl();
		return dateDao;
		}
	public ScheduleDao getScheduleDao(){
		if(scheduleDao==null)scheduleDao = new ScheduleDaoImpl();
		return scheduleDao;
		}
	public ClinicDao getClinicDao(){
		if(clinicDao==null)clinicDao = new ClinicDaoImpl();
		return clinicDao;
		}
}
