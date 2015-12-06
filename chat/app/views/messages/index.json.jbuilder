json.array!(@messages) do |message|
  json.extract! message, :id, :from, :message
  json.url message_url(message, format: :json)
end
