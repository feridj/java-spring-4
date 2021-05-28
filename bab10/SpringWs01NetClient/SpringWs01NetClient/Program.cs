using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Net;
using System.IO;

namespace SpringWs01NetClient
{
    class Program
    {
        static void Main(string[] args)
        {
            const string endPoint = "http://localhost:8081/SpringWs01/greet.json";
            string parameters = "/008/Mr Bean/My name is Bean";

            var request = (HttpWebRequest)WebRequest.Create(endPoint + parameters);

            request.Method = "GET";
            request.ContentLength = 0;
            request.ContentType = "text/json";

            using (var response = (HttpWebResponse)request.GetResponse())
            {
                var responseValue = string.Empty;

                if (response.StatusCode != HttpStatusCode.OK)
                {
                    var message = String.Format("Request failed. Received HTTP {0}", response.StatusCode);
                    throw new ApplicationException(message);
                }

                // grab the response
                using (var responseStream = response.GetResponseStream())
                {
                    if (responseStream != null)
                        using (var reader = new StreamReader(responseStream))
                        {
                            responseValue = reader.ReadToEnd();

                            //The following scripts require Newtonsoft.Json
                            //GreetingJson publicFeed = new GreetingJson();
                            //publicFeed = JsonConvert.DeserializeObject<GreetingJson>(responseValue); 
                        }
                }
                Console.WriteLine(responseValue);
            }

            Console.WriteLine("Press any key to exit.");
            Console.ReadKey();
        }
    }
}
