function fullscreenMenuDisplay() {
    document.querySelector("#menu").addEventListener("click", function () {
        document.querySelector("#fullscreenmenu").style.marginTop = "0vh";
        document.querySelector("#main").style.display = "none";
    })
    document.querySelector("#fullscreenmenu i").addEventListener("click", function () {
        document.querySelector("#fullscreenmenu").style.marginTop = "-100vh";
        document.querySelector("#main").style.display = "initial";
        document.querySelector("#progress").style.width = "0%";
    })
}

function ccAnimation() {
    var ccTimeline = gsap.timeline({
        scrollTrigger: {
            trigger: "#main",
            start: "50% 50%",
            end: "80% 50%",
            scrub: 6,
        }
    })

    if (screen.width < 550) {
        ccTimeline
            .to("#cc", {
                y: "-50vh",
                rotate: "-360deg"
            })
    }
    else {
        ccTimeline
            .to("#cc", {
                y: "-145vh",
                rotate: "-60deg"
            })
    }
}

gsap.from("#uppertext", {
    scrollTrigger: {
        trigger: "#coverpage",
        start: "15% 90%",
        end: "20% 90%",
        scrub: 2
    },
    x: "-30%",
    opacity: 0,
    scale: 1.2,
    duration: 2
});

function casetteAnimation() {

    if (screen.width < 550) {
        gsap.from("#circle h1", {
            scrollTrigger: {
                trigger: "#coverpage",
                start: "35% 60%",
                end: "55% 60%",
                scrub: 1
            },
            y:"10%",
            fontSize: 0,
            rotate: 360,
            duration: 1
        });

        gsap.from("#circle", {
            scrollTrigger: {
                trigger: "#coverpage",
                start: "35% 60%",
                end: "55% 60%",
                scrub: 1
            },
            width: "5%",
            height: "5%",
            duration: 1
        });
    }

    else {
        gsap.from("#circle h1", {
            scrollTrigger: {
                trigger: "#coverpage",
                start: "35% 60%",
                end: "55% 60%",
                scrub: 1
            },
            fontSize: 0,
            rotate: 360,
            duration: 1
        });

        gsap.from("#circle", {
            scrollTrigger: {
                trigger: "#coverpage",
                start: "35% 60%",
                end: "55% 60%",
                scrub: 1
            },
            width: "5%",
            height: "5%",
            duration: 1
        });

        gsap.to("#svg1", {
            scrollTrigger: {
                trigger: "#coverpage",
                start: "30% 60%",
                end: "70% 60%",
                scrub: 7
            },
            rotate: 360,
        })

        gsap.to("#svg2", {
            scrollTrigger: {
                trigger: "#coverpage",
                start: "30% 60%",
                end: "70% 60%",
                scrub: 7
            },
            rotate: -360,
        });
    }

}

function cardsAnimation() {

    var tl = gsap.timeline({
        scrollTrigger: {
            trigger: "#cardspage",
            start: "50% 50%",
            end: "100% 50%",
            scrub: 2,
            pin: true
        },
    })
    if (screen.width < 550) {
        tl
            .from("#card1", {
                y: "150%",
                rotate: 540,
                ease: "Ease.easeInOut"
            });
        tl
            .to(".threecards", {
                x: "-11.5vw",
            });
        tl
            .to(".abcd", {
                x: "-340vw",
                ease: "power1"
            });
    }
    else {
        tl
            .from("#card1", {
                y: "150%",
                rotate: 540,
            });

        tl
            .to(".threecards", {
                x: "-38.1vw",
            });

        tl
            .to(".abcd", {
                x: "-33.5vw",
            });
    }
}

function lettersAndImagesAnimation() {
    if (screen.width < 550) {
        var boxAnimationTimeline = gsap.timeline({
            scrollTrigger: {
                trigger: "#manythanks",
                start: "50% 50%",
                end: "bottom top",
                pin: true,
                scrub: 4
            }
        })

        boxAnimationTimeline.
            to("#strip", {
                x: "-114%",
                ease: "Ease.easeInOut"
            });
    }
    else {
        var tl2 = gsap.timeline({
            scrollTrigger: {
                trigger: "#manythanks",
                start: "50% 50%",
                end: "110% top",
                scrub: 3,
                pin: true,
            }
        });

        tl2.
            to("#strip .boxes", {
                opacity: 1,
                transform: "translateY(0vh) rotate(-20deg)",
                stagger: .2
            }, "a");

        tl2.
            to("#strip .boxes", {
                opacity: 0,
                transform: "translateY(20vh) rotate(-20deg)",
                stagger: .2,
                delay: .2
            }, "a");

        tl2.
            to("#h1 span", {
                transform: "translateY(-3vh)",
                stagger: .2
            }, "a");

        tl2.
            to("#h1 span", {
                transform: "translateY(0vh)",
                stagger: .2,
                delay: .2
            }, "a");

        tl2.
            to("#awesome", {
                left: "140%",
                duration: 2,
                ease: "power3"
            }, "a");
    }
}

function progressBar() {
    window.onscroll = function () { scrollProgress() };

    function scrollProgress() {
        var windowScroll = document.body.scrollTop || document.documentElement.scrollTop;
        var height = document.documentElement.scrollHeight - document.documentElement.clientHeight;
        var scroll = (windowScroll / height) * 100;
        document.querySelector("#progress").style.width = scroll + "%";
    }
}

function fullscreenMenuImageBoxChange() {
    document.querySelectorAll("#atags a")
        .forEach(function (elem) {
            elem.addEventListener("mouseover", function (dets) {
                gsap.to(".images", {
                    x: dets.target.dataset.base * 100 + "%",
                    ease: Expo.easeInOut,
                    duration: 1.5
                })
            })
        })
    document.querySelector("#atags").addEventListener("mouseleave", function () {
        gsap.to(".images", {
            transform: "translateX(0%)",
            duration: 1
        })
    })
}

function footerImageBoxChange() {
    document.querySelectorAll("#links h4")
        .forEach(function (elem) {
            elem.addEventListener("mouseover", function (dets) {
                gsap.to(".imgb", {
                    x: dets.target.dataset.index * -100 + "%",
                    ease:Expo.easeInOut,
                    duration: 1.5
                });
            })
        })
}

function navElementsColorChange() {
    var tl3 = gsap.timeline({
        scrollTrigger: {
            trigger: "#one",
            start: "bottom 5%",
            toggleActions: "play complete reverse reset",
        }
    });

    tl3.
        to("#nav h3", {
            color: "white"
        }, "b")

    tl3.
        to("#nav #menu", {
            color: "rgb(19, 19, 19)",
            backgroundColor: "#fff",
            fontWeight: "900"
        }, "b")
}

casetteAnimation();
cardsAnimation();
lettersAndImagesAnimation();
fullscreenMenuDisplay();
progressBar();
fullscreenMenuImageBoxChange();
footerImageBoxChange();
navElementsColorChange();
ccAnimation();


