// Define a JavaScript array to store enrolled courses
const enrolledCourses = [];

function enroll(courseName) {
    // Check if the course is already enrolled in
    if (enrolledCourses.includes(courseName)) {
        alert("You are already enrolled in this course.");
    } else {
        // Add the course to the enrolled courses array and display a success message
        enrolledCourses.push(courseName);
        alert("You have successfully enrolled in " + courseName + ".");
    }
}
