const loginForm = document.querySelector('form');
const usernameInput = document.querySelector('#username');
const passwordInput = document.querySelector('#password');

loginForm.addEventListener('submit', (e) => {
    e.preventDefault();

    const username = usernameInput.value;
    const password = passwordInput.value;

    if (username === 'admin' && password === 'admin') {
        window.location.href = 'dashboard.html';
    } else {
        alert('Invalid login credentials');
    }
});
