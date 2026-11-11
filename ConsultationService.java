package medcore;

/**
 * MedCore Consultation Service - ICT6420 Assessment 4 component under test.
 *
 * DO NOT MODIFY THIS CLASS. Your task is to design and implement
 * JUnit tests against it (see src/test/java/medcore/ConsultationServiceTest.java).
 */
public class ConsultationService {

    // Rule 1: Consultation fee depends on patient age.
    // Age 0-17 (paediatric): $40. Age 18-64 (standard): $70.
    // Age 65+ (senior): $55. Negative age is invalid.
    public double calculateFee(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        if (age <= 17) {
            return 40.0;
        }
        if (age <= 64) {
            return 70.0;
        }
        return 55.0;
    }

    // Rule 2: A consultation is only valid if its duration is
    // between 10 and 60 minutes (inclusive).
    public boolean isValidDuration(int minutes) {
        return minutes >= 10 && minutes <= 60;
    }

    // Rule 3: A specialist referral is approved only if the
    // patient HAS a referral letter AND their insurance
    // is APPROVED.
    public boolean isReferralApproved(boolean hasReferralLetter, boolean insuranceApproved) {
        return hasReferralLetter && insuranceApproved;
    }
}
