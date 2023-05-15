const chatContainer = document.getElementById('chat-container');
const messageInput = document.getElementById('message-input');
const sendBtn = document.getElementById('send-btn');

function sendMessage() {
    const message = messageInput.value.trim();
    if (message !== '') {
        const messageElem = document.createElement('div');
        messageElem.classList.add('message');
        messageElem.innerText = message;
        chatContainer.appendChild(messageElem);
        messageInput.value = '';
    }
}

sendBtn.addEventListener('click', sendMessage);
messageInput.addEventListener('keydown', event => {
    if (event.key === 'Enter') {
        sendMessage();
    }
});
