const form = document.querySelector('.notification-form');
form.addEventListener('submit', (event) => {
    event.preventDefault();
    const title = document.querySelector('#notification-title').value;
    const message = document.querySelector('#notification-message').value;
    const date = new Date().toLocaleDateString();
    const notification = `
    <li>
      <h3>${title}</h3>
      <p class="notification-date">${date}</p>
      <p class="notification-message">${message}</p>
    </li>
  `;
    const notificationList = document.querySelector('.notification-list');
    notificationList.insertAdjacentHTML('afterbegin', notification);
    form.reset();
});
