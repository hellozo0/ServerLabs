const members = require("./members");

const getOnline = members => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const data = members.filter(o => o.location == "online")
            resolve(data)
        }, 500);
    });
};

const getOffline = members => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const data = members.filter(o => o.location == "offline")
            resolve(data)
        }, 500);
    });
};

const getYB = members => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const data = members.filter(o => o.group == "YB")
            resolve(data)
        }, 500);
    });
};

const getOB = members => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const data = members.filter(o => o.group == "OB")
            resolve(data)
        }, 500);
    });
};

// Promise
getOnline(members).then(x=> getOB(x)).then(console.log);
getYB(members).then(getOffline).then(console.log);

// Async
const asyncFunc1 = async members => {
    const onlineMembers = await getOnline(members);
    const onlineObMembers = await getOB(onlineMembers);
    console.log(onlineObMembers);
}
const asyncFunc2 = async members => {
    const offlineMembers = await getOffline(members);
    const offlineYbMembers = await getYB(offlineMembers);
    console.log(offlineYbMembers);
}

asyncFunc1(members);
asyncFunc2(members);