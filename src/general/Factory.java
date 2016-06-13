package general;

import dao.ListOsmotraDao;
import dao.PhoneConsultationsJournalDao;
import impl.ListOsmotraDaoImpl;
import impl.PhoneConsultationsJournalDaoImpl;
import dao.AddressDao;
import dao.CallDayDao;
import dao.CallPlanningJournalDao;
import dao.CallerDao;
import dao.CardDao;
import dao.ClinicDao;
import dao.ConsultationResultDao;
import dao.ContactDao;
import dao.DateDao;
import dao.DiuresisDao;
import dao.JournalOutpatientReceptionDao;
import impl.CallDayDaoImpl;
import impl.JournalOutpatientReceptionDaoImpl;
import impl.CallPlanningJournalDaoImpl;
import impl.CallerDaoImpl;
import impl.CardDaoImpl;
import impl.ClinicDaoImpl;
import impl.ConsultationResultDaoImpl;
import impl.DateDaoImpl;
import impl.DiuresisDaoImpl;
import impl.EvaluationXbsShvoDaoImpl;
import dao.EvaluationXbsShvoDao;
import dao.HeavyNarcoticJournalDao;
import impl.HeavyNarcoticJournalDaoImpl;
import dao.LiverDao;
import dao.ManipulationDao;
import dao.PacientDao;
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
import table.Manipulation;
import table.Pacient;
import impl.TheartDaoImpl;
import impl.SwallowingActDaoImpl;
import impl.PulseDaoImpl;
import impl.ScheduleDaoImpl;
import impl.PalpationDaoImpl;
import impl.LiverDaoImpl;
import impl.ManipulationDaoImpl;
import impl.PacientDaoImpl;

public class Factory {

	public static Factory instance = new Factory();
	public DateDao dateDao;
	public ManipulationDao manipDao;
	public AddressDao addressDao;
	public ClinicDao clinicDao;
	public ConsultationResultDao consultationResultDao;
	public ContactDao contactDao;
	public PhoneConsultationsJournalDao zyrnalDao;
	public ListOsmotraDao listDao;
	public CallDayDao callDayDao;
	public JournalOutpatientReceptionDao journalOutpatientReceptionDao;
	public CallPlanningJournalDao callPlanningJournalDao;
	public CardDao cardDao;
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
	public PacientDao pacientDao;
	public ScheduleDao  scheduleDao;
	public ConsultationResultDao consultationResuilDao;
	public CallerDao callerDao;
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
	
	public ConsultationResultDao getConsultationResult(){
		if(consultationResultDao==null)consultationResultDao = new ConsultationResultDaoImpl();
		return consultationResultDao;
		}
	public ManipulationDao getManipulationDao(){
		if(manipDao==null)manipDao = new ManipulationDaoImpl();
		return manipDao;
		}
	public CallerDao getCallerDao(){
		if(callerDao==null)callerDao = new CallerDaoImpl();
		return callerDao;
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

	public CardDao getCardDao(){
		if(cardDao==null)cardDao = new CardDaoImpl();
		return cardDao;
		}
	public PacientDao getPacientDao(){
		if(pacientDao==null)pacientDao = new PacientDaoImpl();
		return pacientDao;
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
