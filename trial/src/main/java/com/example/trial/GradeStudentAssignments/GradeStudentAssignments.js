const gradeForm = document.getElementById('grade-form');
const studentNameInput = document.getElementById('student-name');

// This would be the selected student, fetched from the server/database
const selectedStudent = {
    name: 'Sejal Makam',
    email: 'sejal makam@gmail.com',
    assignment: 'assignment1'
};

// Populate the student name input field with the selected student's name
studentNameInput.value = selectedStudent.name;

// Handle form submission
gradeForm.addEventListener('submit', event => {
    event.preventDefault();

    // Get form data
    const grade = document.getElementById('grade').value;
    const feedback = document.getElementById('feedback').value;

    // This is where you would submit the grade and feedback to the server/database
    console.log(`Grade: ${grade}, Feedback: ${feedback}`);

    // Reset the form
    gradeForm.reset();
});
