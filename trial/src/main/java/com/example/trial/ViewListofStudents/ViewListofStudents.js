const studentsList = document.getElementById('students-list');

// This would be a list of enrolled students, fetched from the server/database
const enrolledStudents = [
    {
        name: 'Sejal Makam',
        email: 'sejalmakam@gmail.com',
        progress: '97%'
    },
    {
        name: 'Jyotika S',
        email: 'jyotika@gmail.com',
        progress: '95%'
    },
    // Add more students here
];

// Generate table rows for each enrolled student
enrolledStudents.forEach(student => {
    const row = document.createElement('tr');
    row.innerHTML = `
    <td>${student.name}</td>
    <td>${student.email}</td>
    <td>${student.progress}</td>
  `;
    studentsList.appendChild(row);
});
