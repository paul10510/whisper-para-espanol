import whisper 
model = whisper.load_model("medium")

audio = "02_Pista_02.mp3"
transcribe = model.transcribe(audio)
translate = model.transcribe(audio, task="translate")

print(transcribe["text"])

print("")

print(translate["text"])
