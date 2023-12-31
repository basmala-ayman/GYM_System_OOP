//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InBody {

    //  Scanner input  => for input from user input whole class
    Scanner input = new Scanner(System.in);
    //Declare Variables
    private Date inBodyDate = new Date();
    private float height, totalWeight, bodyFatMass, minerals, totalBodyWater, protein;
    private String[] units = new String[6];
    private char gender;

    // Setters


    public void setInBodyDate(Date inBodyDate) {
        this.inBodyDate = inBodyDate;
    }

    public void setHeight(float height, String unit) {
        units[0]=unit;
        if (height <= 0) {
            throw new IllegalArgumentException("""
                    -------------------------------
                    Height must be greater than 0!!
                    -------------------------------""");
        }

        // Convert height to meters based on the unit
        switch (unit.toLowerCase()) {
            case "cm":
                this.height = height / 100.0f; // Convert centimeters to meters
                break;
            case "ft":
                this.height = height * 0.3048f; // Convert feet to meters
                break;
            case "in":
                this.height = height * 0.0254f; // Convert inches to meters
                break;
            case "m":
                this.height = height; // Assume the input is already meters
                break;
            default:
                // the input is not invalid
                System.out.println("""
                                   ------------------
                                   INVALID UNIT!!
                                   PLEASE, try again.
                                   ------------------""");
                break;
        }
    }

    public void setTotalWeight(float totalWeight, String unit) {
        units[1]=unit;
        if (totalWeight <= 0) {
            throw new IllegalArgumentException("""
                    -------------------------------------
                    Total weight must be greater than 0!!
                    -------------------------------------""");
        }

        // Convert weight to kilograms based on the unit
        switch (unit.toLowerCase()) {
            case "lb":
                this.totalWeight = totalWeight * 0.453592f; // Convert pounds to kilograms
                break;
            case "g":
                this.totalWeight = totalWeight / 1000.0f; // Convert grams to kilograms
                break;
            case "kg":
                this.totalWeight = totalWeight; // Assume the input is already input kilograms
                break;
            default:
                System.out.println("""
                                   ------------------
                                   INVALID UNIT!!
                                   PLEASE, try again.
                                   ------------------""");
                break;
        }
    }

    public void setBodyFatMass(float bodyFatMass, String unit) {
        units[2]=unit;
        if (bodyFatMass <= 0) {
            throw new IllegalArgumentException("""
                    --------------------------------------
                    Body Fat Mass must be greater than 0!!
                    --------------------------------------""");
        }

        // Convert bodyFatMass to kilograms based on the unit
        switch (unit.toLowerCase()) {
            case "lb":
                this.bodyFatMass = bodyFatMass * 0.453592f; // Convert pounds to kilograms
                break;
            case "g":
                this.bodyFatMass = bodyFatMass / 1000.0f; // Convert grams to kilograms
                break;
            case "kg":
                this.bodyFatMass = bodyFatMass; // Assume the input is already input kilograms
                break;
            default:
                System.out.println("""
                                   ------------------
                                   INVALID UNIT!!
                                   PLEASE, try again.
                                   ------------------""");
                break;
        }
    }

    public void setMinerals(float minerals, String unit) {
        units[3]=unit;
        if (minerals <= 0) {
            throw new IllegalArgumentException("""
                    ---------------------------------
                    Minerals must be greater than 0!!
                    ---------------------------------""");
        }

        // Convert minerals to kilograms based on the unit
        switch (unit.toLowerCase()) {
            case "lb":
                this.minerals = minerals * 0.453592f; // Convert pounds to kilograms
                break;
            case "g":
                this.minerals = minerals / 1000.0f; // Convert grams to kilograms
                break;
            case "kg":
                this.minerals = minerals; // Assume the input is already input kilograms
                break;
            default:
                System.out.println("""
                                   ------------------
                                   INVALID UNIT!!
                                   PLEASE, try again.
                                   ------------------""");
                break;
        }
    }

    public void setTotalBodyWater(float totalBodyWater, String unit) {
        units[4]=unit;
        if (totalBodyWater <= 0) {
            throw new IllegalArgumentException("""
                    -----------------------------------------
                    Total Body Water must be greater than 0!!
                    -----------------------------------------""");
        }

        // Convert totalBodyWater to kilograms based on the unit
        switch (unit.toLowerCase()) {
            case "lb":
                this.totalBodyWater = totalBodyWater * 0.453592f; // Convert pounds to kilograms
                break;
            case "g":
                this.totalBodyWater = totalBodyWater / 1000.0f; // Convert grams to kilograms
                break;
            case "kg":
                this.totalBodyWater = totalBodyWater; // Assume the input is already input kilograms
                break;
            default:
                System.out.println("""
                                   ------------------
                                   INVALID UNIT!!
                                   PLEASE, try again.
                                   ------------------""");
                break;
        }
    }

    public void setProtein(float protein, String unit) {
        units[5]=unit;
        if (protein <= 0) {
            throw new IllegalArgumentException("""
                    --------------------------------
                    Protein must be greater than 0!!
                    --------------------------------""");
        }

        // Convert bodyFatMass to kilograms based on the unit
        switch (unit.toLowerCase()) {
            case "lb":
                this.protein = protein * 0.453592f; // Convert pounds to kilograms
                break;
            case "g":
                this.protein = protein / 1000.0f; // Convert grams to kilograms
                break;
            case "kg":
                this.protein = protein; // Assume the input is already input kilograms
                break;
            default:
                System.out.println("""
                                   ------------------
                                   INVALID UNIT!!
                                   PLEASE, try again.
                                   ------------------""");
                break;
        }
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Getters

    public Date getInBodyDate() {
        return inBodyDate;
    }

    public float getHeight() {
        return height;
    }

    public float getTotalWeight() {
        return totalWeight;
    }

    public float getBodyFatMass() {
        return bodyFatMass;
    }

    public float getMinerals() {
        return minerals;
    }

    public float getTotalBodyWater() {
        return totalBodyWater;
    }

    public float getProtein() {
        return protein;
    }

    public String[] getUnits() {
        return units;
    }

    public char getGender() {
        return gender;
    }

    public void displayInBodyDetails() {
        System.out.println("""
                --------------------
                The In-Body Details:
                --------------------""");
        System.out.println("Height: " + height + " meters.\n"
                + "Total Weight: " + totalWeight + " kilograms.\n"
                + "Body Fat Mass: " + bodyFatMass + " kilograms.\n"
                + "Minerals: " + minerals + " kilograms.\n"
                + "Total Body Water: " + totalBodyWater + " kilograms.\n"
                + "Protein: " + protein + " kilograms.\n"
                + "-------------------------------------------------------");
    }

    // input-body methods
    private static void CalculateBMI(float totalWeight, float height) {
        float BMI = (totalWeight) / (height * height); //BMI = Body Mass Index
        System.out.println("-----------------------------------------------------");
        System.out.println("Your BMI value: " + BMI);

        if (BMI < 18.5) {
            System.out.println("You are underweight!");
        } else if (BMI < 25) {
            System.out.println("You are normal:)");
        } else if (BMI < 30) {
            System.out.println("You are overweight!");
        } else {
            System.out.println("You are obese!");
        }
    }

    // Method to display the recommended weight to be reduced
    public void displayRecommendedWeightLoss() {
        CalculateBMI(totalWeight, height);

        float idealBodyWeight = calculateIdealBodyWeight();

        // Calculate the recommended weight loss as the difference between the current weight and the ideal weight
        float recommendedLossInKilos = totalWeight - idealBodyWeight;

        System.out.println("Ideal Body Weight: " + idealBodyWeight + " Kg");
        System.out.println("Recommended Weight Loss in Kilograms: " + recommendedLossInKilos + " kg");
    }

    // Method to calculate ideal body weight using the Devine's formula
    private float calculateIdealBodyWeight() {
        float baseWeight;

        if (this.gender == 'F' || this.gender == 'f') {
            baseWeight = 45.5f;
        }
        else {
            baseWeight = 50.0f;
        }

        // Additional weight calculation (2.3 kg per inch over 5 feet)
        //  1.524 = 5 feet input meters.
        // 1 inches = 0.0254 meters.
        float additionalWeight = 2.3f * ((height - 1.524f) / 0.0254f);

        return (baseWeight + additionalWeight);
    }

}
